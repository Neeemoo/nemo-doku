#There are four collection (array) data types
    #List           is a collection which is ordered and changeable.                    Allows duplicate members.
#Tuple              is a collection which is ordered and unchangeable.                  Allows duplicate members.
    #Set            is a collection which is unordered and unindexed.                   No duplicate members.
    #Dictionary     is a collection which is unordered, changeable and indexed.         No duplicate members.

#create a Tuple
thistuple = ("apple", "banana", "cherry")
print(thistuple)
#output = ('apple', 'banana', 'cherry')

#alternative way to create a list using the list() constructor
thistuple = tuple(("apple", "banana", "cherry")) # note the double round-brackets
print(thistuple)
#output = ('apple', 'banana', 'cherry')

# It's the same as lists, the only differences are that lists are written with
# square brackets and a Tuple with round ones and that you cannot change the value of a Tuple
#(change a value, delete a value, add a value) but you can still delete the entire Tuple

#Tuple Methods:
#Method    #Description
#count()	Returns the number of times a specified value occurs in a tuple
#index()	Searches the tuple for a specified value and returns the position of where it was found
