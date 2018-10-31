﻿#Requires -version 2.0
Register-WmiEvent -Class win32_VolumeChangeEvent -SourceIdentifier volumeChange
write-host (get-date -format s) " Beginning script..."
do{
    $newEvent = Wait-Event -SourceIdentifier volumeChange
    $eventType = $newEvent.SourceEventArgs.NewEvent.EventType
    $eventTypeName = switch($eventType) {
        1 {"Configuration changed"}
        2 {"Device arrival"}
        3 {"Device removal"}
        4 {"docking"}
    }

    write-host (get-date -format s) " Event detected = " $eventTypeName

    if ($eventType -eq 2) {
        $driveLetter = $newEvent.SourceEventArgs.NewEvent.DriveName
        $driveLabel = ([wmi]"Win32_LogicalDisk='$driveLetter'").VolumeName
        write-host (get-date -format s) " Drive name = " $driveLetter
        write-host (get-date -format s) " Drive label = " $driveLabel
    
        # Execute process if drive matches specified condition(s)

        if ($driveLetter -eq 'N:' -and $driveLabel -eq 'VID_0781&PID_5581') {
            write-host (get-date -format s) " Starting task in 3 seconds..."
            start-sleep -seconds 3
            start-process "N:\Backup.bat"
        }
    }

    Remove-Event -SourceIdentifier volumeChange
} while (1-eq1) #Loop until next event

Unregister-Event -SourceIdentifier volumeChange