#http://introtopython.org/classes.html

class Rocket():
    def __init__(self):
    #The First thing you have to do is to define the __init__() method
    #The __init__ () method sets the values for any parameters that need to be defined when an object is first created.
        self.x = 0
        self.y = 0

    def moveUp(self):
        self.y += 1

    def moveDown(self):
        self.y -= 1

    #create a object in the class Rocket with the name myRocket

#MOVE ROCKET BACK AND FORWARD
# myRocket = Rocket()
# print("Rocket altitude: ", myRocket.y)
#
# myRocket.moveUp()
# print("Rocket altitude: ", myRocket.y)
#
# myRocket.moveDown()
# print("Rocket altitude: ", myRocket.y)
#
# myRocket.moveUp()
# print("Rocket altitude: ", myRocket.y)

#ROCKET FLEET
# myRockets = []
# for x in range (0, 5):
#     newRocket = Rocket()
#     myRockets.append(newRocket)
#
# for rocket in myRockets:
#     print(rocket)
