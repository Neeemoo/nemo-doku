#There are four collection (array) data types
    #List           is a collection which is ordered and changeable.                    Allows duplicate members.
    #Tuple          is a collection which is ordered and unchangeable.                  Allows duplicate members.
#Set                is a collection which is unordered and unindexed.                   No duplicate members.
    #Dictionary     is a collection which is unordered, changeable and indexed.         No duplicate members.

#create a Set
thisset = {"apple", "banana", "cherry"}
print(thisset)
#output = {'apple', 'cherry', 'banana'} --> random order

#alternative way to create a Set using the set() constructor
thisset = set(("apple", "banana", "cherry")) # note the double round-brackets
print(thisset)
#output = {'cherry', 'apple', 'banana'} --> random order

# It's the same as lists, the only differences are that lists are written with
# square brackets and Sets with curly ones, that you cannot select a value with the index (z.B. print(thisset[2]))
# since it is'nt orderd, you cannot change any values of the set you can though delete and add values and
# some other commands witch are diffrent from the list commands

#Add values

#adds the value orange
thisset = {"apple", "banana", "cherry"}
thisset.add("orange")
print(thisset)
#output = {'cherry', 'orange', 'banana', 'apple'} --> random order

#adds more than one value
thisset = {"apple", "banana", "cherry"}
thisset.update(["orange", "mango", "grapes"])
print(thisset)
#output = {'grapes', 'orange', 'apple', 'cherry', 'mango', 'banana'} --> random order

#Remove values

#removes a value and if it doesn't exist returns an error
thisset = {"apple", "banana", "cherry"}
thisset.remove("banana")
print(thisset)
#output = {'cherry', 'apple'} --> random order

#removes a value and if it doesn't exist it DOESN'T return an error
thisset = {"apple", "banana", "cherry"}
thisset.discard("banana")
print(thisset)
#output = {'apple', 'cherry'} --> random order

#pop() works too but since it deletes the last value and the order is random it deletes just a random one
#clear() works too
#del() works too but just to delete the entire set since you cannot use the index

#Set Methods:
#Method 	                   #Description
#add()	                        Adds an element to the set
#clear()	                    Removes all the elements from the set
#copy()	                        Returns a copy of the set
#difference()	                Returns a set containing the difference between two or more sets
#difference_update()	        Removes the items in this set that are also included in another, specified set
#discard()	                    Remove the specified item
#intersection()	                Returns a set, that is the intersection of two other sets
#intersection_update()	        Removes the items in this set that are not present in other, specified set(s)
#isdisjoint()	                Returns whether two sets have a intersection or not
#issubset()	                    Returns whether another set contains this set or not
#issuperset()	                Returns whether this set contains another set or not
#pop()	                        Removes the specified element
#remove()	                    Removes the specified element
#symmetric_difference()	        Returns a set with the symmetric differences of two sets
#symmetric_difference_update()	Inserts the symmetric differences from this set and another
#union()	                    Return a set containing the union of sets
#update()	                    Update the set with the union of this set and others
