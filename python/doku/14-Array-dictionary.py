#There are four collection (array) data types
    #List           is a collection which is ordered and changeable.                    Allows duplicate members.
    #Tuple          is a collection which is ordered and unchangeable.                  Allows duplicate members.
    #Set            is a collection which is unordered and unindexed.                   No duplicate members.
#Dictionary         is a collection which is unordered, changeable and indexed.         No duplicate members.

#create a Dictionary
#brand, model and year are key names
thisdict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(thisdict)
#output = {'brand': 'Ford', 'model': 'Mustang', 'year': 1964}

#you can access the items of a dictionary by referring to its key name
x = thisdict["model"]

# https://www.w3schools.com/python/python_dictionaries.asp
