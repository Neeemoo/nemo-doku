#include <iostream>
#include <fstream>
#include <math.h>
#include <iomanip>
#include <string>
using namespace std;

int main () {

	string top  = " ___________ __________ __________ ";
	string btwn = "|           |          |          |";
	string botm = "|___________|__________|__________|";
	string untn = "|           |__________|__________|";
	string left = "|           |    ";
	string midl = "    |   ";
	string nazi = "   |";

	string b;

	exit:
	system("cls");

	unbekannterbefehl:

	string was;
	cout << "Geben sie die Nummer eines Modus ein um dessen eingetragenen Noten zu sehen\nFalls Sie die Noten bearbeiten m"<< "\x94" <<"chten, m"<< "\x81" <<"ssen Sie edit eingeben" << endl << endl;
	cout << "> ";
	cin >> was;
	cout << endl;

	if (was == "edit") {
		repeat:
		system("cls");
		cout << "Aktuelle Module:\n M-133\n M-153\n M-120\n M-152\n M-254\n M-307\n M-411\n M-226a\n M-226b\n\nMit exit verlassen Sie die Bearbeitung\nWelches Modul wollen Sie bearbeiten?" << endl << endl;
		cout << "> ";
		cin >> b;
		cout << endl;

	 		if (b == "exit") {
	 			goto exit;
			}
			else if (b == "133" || b == "M-133" || b == "m133" || b == "m-133" || b == "M133") {
				ofstream m133;
				m133.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-133.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note des Moduljournals: ";
				double mj;
				cin >> mj;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				double needed;

				if (lb == 0 && mj == 0) {
					durchschnitt = zp;
				}

				else if (lb == 0) {
					durchschnitt = ((zp*0.3+mj*0.2)*2);
					needed = (3.75-(zp*0.3+mj*0.2)*2);
				}

				else {
					durchschnitt = zp*0.3+mj*0.2+lb*0.5;
				}
				float ds = roundf(durchschnitt * 100) / 100;

				m133 << top  << endl;
				m133 << btwn << endl;
				m133 << "| Modul-133 |    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m133 << botm << endl;

				m133 << btwn << endl;
				m133 << left << "MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
				m133 << untn << endl;

				m133 << btwn << endl;
				m133 << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m133 << untn << endl;

				m133 << btwn << endl;
				m133 << left << "DS" << midl << ds << nazi << endl;
				m133 << untn << endl;

				if (zp != 0 && mj != 0) {
					m133 << btwn << endl;
					m133 << left << "Mindestnote f" << "\x81" <<"r eine Vier" << midl << durchschnitt << nazi << endl;
					m133 << botm << endl;
				}
			}

			else if (b == "153" || b == "M-153" || b == "m153" || b == "m-153" || b == "M153") {
				ofstream m153;
				m153.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-153.txt");

				double lb2;
				cout << "Note der Leistungsbeurteilung: ";
				cin >> lb2;

				double ds2;
				ds2 = lb2;

				m153 << top  << endl;
				m153 << btwn << endl;
				m153 << "| Modul-133 |    LB" << midl << fixed << setprecision(2) << lb2 << nazi << endl;
				m153 << botm << endl;

				m153 << left << "DS" << midl << fixed << setprecision(2) << ds2 << nazi << endl;
				m153 << botm << endl;
			}

			else if (b == "120" || b == "M-120" || b == "m120" || b == "m-120" || b == "M120") {
				ofstream m120;
				m120.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-120.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note des Moduljournals: ";
				double mj;
				cin >> mj;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				double needed;

				if (lb == 0 && mj == 0) {
					durchschnitt = zp;
				}

				else if (lb == 0) {
					durchschnitt = ((zp*0.3+mj*0.2)*2);
					needed = (3.75-(zp*0.3+mj*0.2)*2);
				}

				else {
					durchschnitt = zp*0.3+mj*0.2+lb*0.5;
				}
				float ds = roundf(durchschnitt * 100) / 100;

				m120 << top  << endl;
				m120 << btwn << endl;
				m120 << "| Modul-120 |    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m120 << botm << endl;

				m120 << btwn << endl;
				m120 << left << "MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
				m120 << untn << endl;

				m120 << btwn << endl;
				m120 << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m120 << untn << endl;

				m120 << btwn << endl;
				m120 << left << "DS" << midl << ds << nazi << endl;
				m120 << botm << endl;
			}

			else if (b == "152" || b == "M-152" || b == "m152" || b == "M-152" || b == "m152") {
				ofstream m152;
				m152.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-152.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note des Moduljournals: ";
				double mj;
				cin >> mj;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				double needed;

				if (lb == 0 && mj == 0) {
					durchschnitt = zp;
				}

				else if (lb == 0) {
					durchschnitt = ((zp*0.3+mj*0.2)*2);
					needed = (3.75-(zp*0.3+mj*0.2)*2);
				}

				else {
					durchschnitt = zp*0.3+mj*0.2+lb*0.5;
				}
				float ds = roundf(durchschnitt * 100) / 100;

				m152 << top  << endl;
				m152 << btwn << endl;
				m152 << "| Modul-152 |    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m152 << botm << endl;

				m152 << btwn << endl;
				m152 << left << "MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
				m152 << untn << endl;

				m152 << btwn << endl;
				m152 << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m152 << untn << endl;

				m152 << btwn << endl;
				m152 << left << "DS" << midl << ds << nazi << endl;
				m152 << botm << endl;
			}

			else if (b == "254" || b == "M-254" || b == "m254" || b == "m-254" || b == "M254") {
				ofstream m254;
				m254.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-254.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note des Moduljournals: ";
				double mj;
				cin >> mj;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				double needed;

				if (lb == 0 && mj == 0) {
					durchschnitt = zp;
				}

				else if (lb == 0) {
					durchschnitt = ((zp*0.3+mj*0.2)*2);
					needed = (3.75-(zp*0.3+mj*0.2)*2);
				}

				else {
					durchschnitt = zp*0.3+mj*0.2+lb*0.5;
				}
				float ds = roundf(durchschnitt * 100) / 100;

				m254 << top  << endl;
				m254 << btwn << endl;
				m254 << "| Modul-254 |    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m254 << botm << endl;

				m254 << btwn << endl;
				m254 << left << "MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
				m254 << untn << endl;

				m254 << btwn << endl;
				m254 << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m254 << untn << endl;

				m254 << btwn << endl;
				m254 << left << "DS" << midl << ds << nazi << endl;
				m254 << botm << endl;
			}

			else if (b == "307" || b == "M-307" || b == "m307" || b == "m-307" || b == "M307") {
				ofstream m307;
				m307.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-307.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note des Moduljournals: ";
				double mj;
				cin >> mj;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				double needed;

				if (lb == 0 && mj == 0) {
					durchschnitt = zp;
				}

				else if (lb == 0) {
					durchschnitt = ((zp*0.3+mj*0.2)*2);
					needed = (3.75-(zp*0.3+mj*0.2)*2);
				}

				else {
					durchschnitt = zp*0.3+mj*0.2+lb*0.5;
				}
				float ds = roundf(durchschnitt * 100) / 100;

				m307 << top  << endl;
				m307 << btwn << endl;
				m307 << "| Modul-307 |    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m307 << botm << endl;

				m307 << btwn << endl;
				m307 << left << "MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
				m307 << untn << endl;

				m307 << btwn << endl;
				m307 << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m307 << untn << endl;

				m307 << btwn << endl;
				m307 << left << "DS" << midl << ds << nazi << endl;
				m307 << botm << endl;
			}

			else if (b == "411" || b == "M-411" || b == "m411" || b == "m-411" || b == "M411") {
				ofstream m411;
				m411.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-411.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				durchschnitt = zp*0.4+lb*0.6;
				float ds = roundf(durchschnitt * 100) / 100;

				m411 << top  << endl;
				m411 << btwn << endl;
				m411 << "| Modul-411 |    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m411 << botm << endl;

				m411 << btwn << endl;
				m411 << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m411 << untn << endl;

				m411 << btwn << endl;
				m411 << left << "DS" << midl << ds << nazi << endl;
				m411 << botm << endl;
			}

			else if (b == "226" || b == "M-226" || b == "m226" || b == "m-226" || b == "M226") {
				dudumm:
				string aob;
				cout << "226a oder 226b? ";
				cin >> aob;

				if (aob == "a" || aob == "A" || aob == "226a" || aob == "m226a" || aob == "M-226a" || aob == "226A" || aob == "M226a" || aob == "m-226a" || aob == "m226A" || aob == "m-226A" || aob == "M226A" || aob == "M-226A") {
						ofstream m226a;
						m226a.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-226a.txt");

						cout << "Note der Zwischenpr" << "\x81" << "fung: ";
						double zp;
						cin >> zp;

						cout << "Note der Leistungsbeurteilung: ";
						double lb;
						cin >> lb;

						double durchschnitt;
						durchschnitt = zp*0.35+lb*0.65;
						float ds = roundf(durchschnitt * 100) / 100;

						m226a << top  << endl;
						m226a << btwn << endl;
						m226a << "| Modul-226a|    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
						m226a << botm << endl;

						m226a << btwn << endl;
						m226a << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
						m226a << untn << endl;

						m226a << btwn << endl;
						m226a << left << "DS" << midl << ds << nazi << endl;
						m226a << botm << endl;
					}

				else if (aob == "b" || aob == "B" || aob == "226b" || aob == "m226b" || aob == "M-226b" || aob == "226B" || aob == "M226b" || aob == "m-226b" || aob == "m226B" || aob == "m-226B" || aob == "M226B" || aob == "M-226B") {
						ofstream m226b;
						m226b.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-226b.txt");

						cout << "Note der Zwischenpr" << "\x81" << "fung: ";
						double zp;
						cin >> zp;

						cout << "Note des Moduljournals: ";
						double mj;
						cin >> mj;

						cout << "Note der Leistungsbeurteilung: ";
						double lb;
						cin >> lb;

						double durchschnitt;
						durchschnitt = zp*0.3+mj*0.2+lb*0.5;
						float ds = roundf(durchschnitt * 100) / 100;

						m226b << top  << endl;
						m226b << btwn << endl;
						m226b << "| Modul-226b|    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
						m226b << botm << endl;

						m226b << btwn << endl;
						m226b << left << "MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
						m226b << untn << endl;

						m226b << btwn << endl;
						m226b << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
						m226b << untn << endl;

						m226b << btwn << endl;
						m226b << left << "DS" << midl << ds << nazi << endl;
						m226b << botm << endl;
					}

				else {
					cout << endl;
					cout << "Try again" << endl;
					goto dudumm;
					}
			}

			else if (b == "226a" || b == "m226a" || b == "M-226a" || b == "226A" || b == "M226a" || b == "m-226a" || b == "m226A" || b == "m-226A" || b == "M226A" || b == "M-226A") {
				ofstream m226a;
				m226a.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-226a.txt");

				cout << "Note der Zwischenpr" << "\x81" << "fung: ";
				double zp;
				cin >> zp;

				cout << "Note der Leistungsbeurteilung: ";
				double lb;
				cin >> lb;

				double durchschnitt;
				durchschnitt = zp*0.35+lb*0.65;
				float ds = roundf(durchschnitt * 100) / 100;

				m226a << top  << endl;
				m226a << btwn << endl;
				m226a << "| Modul-226a|    ZP" << midl << fixed << setprecision(2) << zp << nazi << endl;
				m226a << botm << endl;

				m226a << btwn << endl;
				m226a << left << "LB" << midl << fixed << setprecision(2) << lb << nazi << endl;
				m226a << untn << endl;

				m226a << btwn << endl;
				m226a << left << "DS" << midl << ds << nazi << endl;
				m226a << botm << endl;
			}

			else if (b == "226b" || b == "m226b" || b == "M-226b" || b == "226B" || b == "M226b" || b == "m-226b" || b == "m226B" || b == "m-226B" || b == "M226B" || b == "M-226B") {
				ofstream m226b;
				m226b.open("D:/DATA/IT/c-cpp/cpp/Notenberechnung/Module/m-226b.txt");

				cout << "Note des Moduljournals: ";
				double mj;
				cin >> mj;

				double durchschnitt;
				durchschnitt = mj;
				float ds = roundf(durchschnitt * 100) / 100;

				m226b << top  << endl;
				m226b << btwn << endl;
				m226b << "| Modul-226b|    MJ" << midl << fixed << setprecision(2) << mj << nazi << endl;
				m226b << botm << endl;

				m226b << btwn << endl;
				m226b << left << "DS" << midl << ds << nazi << endl;
				m226b << botm << endl;
			}

			else {
				system("cls");
				cout << "BITTE GEBEN SIE NUR DIE MODULNUMMER EIN!" << endl << endl;
				goto repeat;
			}

		system("cls");
		goto repeat;
	}

	else if (was == "133" || was == "M-133" || was == "m133" || was == "m-133" || was == "M133") {
		ifstream m133;  // Datei-Handle
    	string m;
    	m133.open("Module/m-133.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m133.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m133, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "153" || was == "M-153" || was == "m153" || was == "m-153" || was == "M153") {
		ifstream m153;  // Datei-Handle
    	string m;
    	m153.open("Module/m-153.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m153.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m153, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "120" || was == "M-120" || was == "m120" || was == "m-120" || was == "M120") {
		ifstream m120;  // Datei-Handle
    	string m;
    	m120.open("Module/m-120.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m120.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m120, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "152" || was == "M-152" || was == "m152" || was == "M-152" || was == "m152") {
		ifstream m152;  // Datei-Handle
    	string m;
    	m152.open("Module/m-152.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m152.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m152, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "254" || was == "M-254" || was == "m254" || was == "m-254" || was == "M254") {
		ifstream m254;  // Datei-Handle
    	string m;
    	m254.open("Module/m-254.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m254.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m254, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "307" || was == "M-307" || was == "m307" || was == "m-307" || was == "M307") {
		ifstream m307;  // Datei-Handle
    	string m;
    	m307.open("Module/m-307.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m307.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m307, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "411" || was == "M-411" || was == "m411" || was == "m-411" || was == "M411") {
		ifstream m411;  // Datei-Handle
    	string m;
    	m411.open("Module/m-411.txt", ios::in); // �ffne Datei aus Parameter
    	while (!m411.eof())          // Solange noch Daten vorliegen
    	{
    	    getline(m411, m);        // Lese eine Zeile
    	    cout << m << endl;    // Zeige sie auf dem wasildschirm
		}
	}

	else if (was == "226" || was == "M-226" || was == "m226" || was == "m-226" || was == "M226") {
		dudummi:
		string aoba = "a";
		cout << "226a oder 226b? ";
		cin >> aoba;

		if (aoba == "a") {
			ifstream m226a;  // Datei-Handle
	    	string m;
	    	m226a.open("Module/m-226a.txt", ios::in); // �ffne Datei aus Parameter

    		while (!m226a.eof())          // Solange noch Daten vorliegen
    		{
    		    getline(m226a, m);        // Lese eine Zeile
    		    cout << m << endl;    // Zeige sie auf dem Bildschirm
			}
		}

		else if (aoba == "b") {
			ifstream m226b;  // Datei-Handle
    		string m;
    		m226b.open("Module/m-226b.txt", ios::in); // �ffne Datei aus Parameter

    		while (!m226b.eof())          // Solange noch Daten vorliegen
    		{
    		    getline(m226b, m);        // Lese eine Zeile
    		    cout << m << endl;    // Zeige sie auf dem Bildschirm
			}
		}

		else {
			cout << endl;
			cout << "Try again" << endl;
			goto dudummi;
		}
	}

	else if (was == "226a" || was == "m226a" || was == "M-226a" || was == "226A" || was == "M226a" || was == "m-226a" || was == "m226A" || was == "m-226A" || was == "M226A" || was == "M-226A") {
		ifstream m226a;  // Datei-Handle
	   	string m;
    	m226a.open("Module/m-226a.txt", ios::in); // �ffne Datei aus Parameter

		while (!m226a.eof())          // Solange noch Daten vorliegen
		{
		    getline(m226a, m);        // Lese eine Zeile
		    cout << m << endl;    // Zeige sie auf dem Bildschirm
		}
	}

	else if (was == "226b" || was == "m226b" || was == "M-226b" || was == "226B" || was == "M226b" || was == "m-226b" || was == "m226B" || was == "m-226B" || was == "M226B" || was == "M-226B") {
		ifstream m226b;  // Datei-Handle
    	string m;
    	m226b.open("Module/m-226b.txt", ios::in); // �ffne Datei aus Parameter

		while (!m226b.eof())          // Solange noch Daten vorliegen
		{
		    getline(m226b, m);        // Lese eine Zeile
		    cout << m << endl;    // Zeige sie auf dem Bildschirm
		}
	}

	else {
		system("cls");
		cout <<"DER BEFEHL "<< was <<" IST UNBEKANNT!" << endl << endl;
		goto unbekannterbefehl;
	}
	goto unbekannterbefehl;
	return 0;
}
