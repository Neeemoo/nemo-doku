#'hello' = "hello"

#H = position 0
a = "Hello World!"
print(a[1])
#output = e

#2:5 = output position 1-3
b = "Hello World!"
print(b[1:4]) #4 --> not included
#output = ell

#strip() = removes any whitespace from the start or end
a = "    Hello World!   "
print(a.strip()) #returns "Hello World!
#output = Hello World!

#len() = returns the length of the string
a = "Hello World!"
print(len(a))
#output = 12

#lower() = returns the string in lower case
a = "HELLO WORLD!"
print(a.lower())
#output = hello world!

#upper() = returns the string in upper case
a = "Hello World!"
print(a.upper())
#output = HELLO WORLD!

#replace() = replaces one or more letters with other ones
a = "Hello World!"
print(a.replace("H", "J")) #It's case sensitive
#output = Jello World!

#split() = splits a string into substrings
a = "Hello . World!"
print(a.split("."))
#output = ['Hello ', 'World']
