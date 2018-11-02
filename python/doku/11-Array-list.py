#There are four collection (array) data types
#List               is a collection which is ordered and changeable.                    Allows duplicate members.
    #Tuple          is a collection which is ordered and unchangeable.                  Allows duplicate members.
    #Set            is a collection which is unordered and unindexed.                   No duplicate members.
    #Dictionary     is a collection which is unordered, changeable and indexed.         No duplicate members.

#return the entire list
thislist = ["apple", "banana", "cherry"]
print(thislist)
#output = ['apple', 'banana', 'cherry']

#alternative way to create a list using the list() constructor
thislist = list(("apple", "banana", "cherry")) #note the double round-brackets
print(thislist)
#output = ['apple', 'banana', 'cherry']

#return the second value (strating point of any array is 0)
thislist = ["apple", "banana", "cherry"]
print(thislist[1])
#output = banana

#change the value of the second position in the list
thislist = ["apple", "banana", "cherry"]
thislist[1] = "blackcurrant"
print(thislist)
#output = ['apple', 'blackcurrant', 'cherry']

#repeat the loop once for every value in the list
thislist = ["apple", "banana", "cherry"]
for x in thislist:
  print(x)
#output = apple
#         banana
#         cherry

#to check if a value exists in the list
thislist = ["apple", "banana", "cherry"]
if "apple" in thislist:
  print("Yes, 'apple' is in the list")
#output = Yes, 'apple' is in the list

#returns the lenght of the list
thislist = ["apple", "banana", "cherry"]
print(len(thislist))
#output = 3

#add a value to the lsit
thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)
#output = ['apple', 'banana', 'cherry', 'orange']

#add a value at a certain position in the list
thislist = ["apple", "banana", "cherry"]
thislist.insert(1, "orange")
print(thislist)
#output = ['apple', 'orange', 'banana', 'cherry']


#to delete a value of the list:

#deletes the value banana from the list
thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")
print(thislist)
#output = ['apple', 'cherry']

#removes the specified index and if not specified removes the last value
thislist = ["apple", "banana", "cherry"]
thislist.pop()
print(thislist)
#output = ['apple', 'banana']

#removes the specified index and if not specified the entire list
thislist = ["apple", "banana", "cherry"]
del thislist[0]
print(thislist)
#output = ['banana', 'cherry']

#deletes every value of the list
thislist = ["apple", "banana", "cherry"]
thislist.clear()
print(thislist)
#output = []

#List Methods:
#Method 	  #Description
#append()	   Adds an element at the end of the list
#clear()	   Removes all the elements from the list
#copy()	       Returns a copy of the list
#count()	   Returns the number of elements with the specified value
#extend()	   Add the elements of a list (or any iterable), to the end of the current list
#index()	   Returns the index of the first element with the specified value
#insert()	   Adds an element at the specified position
#pop()	       Removes the element at the specified position
#remove()	   Removes the item with the specified value
#reverse()	   Reverses the order of the list
#sort()	       Sorts the list
