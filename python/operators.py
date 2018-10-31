#https://www.w3schools.com/python/python_operators.asp
#Python divides the operators in the following groups:
#    Arithmetic operators
#    Assignment operators
#    Comparison operators
#    Logical operators
#    Identity operators
#    Membership operators
#    Bitwise operators

#Python Arithmetic Operators --> to do common mathematical operations
#Operator     #Name                        #Example
 #+	           Addition                     x + y
 #-	           Subtraction                  x - y
 #*	           Multiplication               x * y
 #/	           Division                     x / y
 #%	           Modulus                      x % y
 #** 	       Exponentiation 	            x ** y
 #// 	       Floor division 	            x // y

#Python Assignment Operators --> to assign values to variables
#Operator     #Example                     #Same As
 #=	           x = 5 	                    x = 5
 #+= 	       x += 3 	                    x = x + 3
 #-= 	       x -= 3 	                    x = x - 3
 #*= 	       x *= 3 	                    x = x * 3
 #/= 	       x /= 3 	                    x = x / 3
 #%= 	       x %= 3                       x = x % 3
 #//= 	       x //= 3                      x = x // 3
 #**= 	       x **= 3                      x = x ** 3
 #&= 	       x &= 3 	                    x = x & 3
 #|= 	       x |= 3 	                    x = x | 3
 #^= 	       x ^= 3 	                    x = x ^ 3
 #>>= 	       x >>= 3                      x = x >> 3
 #<<= 	       x <<= 3                      x = x << 3

#Python Comparison Operators --> to campare two values
#Operator #Name #Example
#Operator     #Name                        #Example
 #== 	       Equal                       	x == y
 #!= 	       Not equal 	                x != y
 #>	           Greater than             	x > y
 #<	           Less than 	                x < y
 #>= 	       Greater than or equal to 	x >= y
 #<= 	       Less than or equal to       	x <= y

#Python Logical Operators --> to combine conditional statements
#Operator 	#Description 	                                                                       #Example
 #and  	     Returns True if both statements are true 	                                            x < 5 and  x < 10
 #or 	     Returns True if one of the statements is true 	                                        x < 5 or x < 4
 #not    	 Reverse the result, returns False if the result is true 	                            not(x < 5 and x < 10)

#Python Identity Operators --> to compare the objects (not if they are equal but if they are the same)
#Operator 	#Description 	                                                                       #Example
 #is  	     Returns true if both variables are the same object 	                                x is y
 #is not 	 Returns true if both variables are not the same object 	                            x is not y

#Python Membership Operators --> to test if a sequence is presented in an object
#Operator 	#Description 	                                                                       #Example
 #in  	     Returns True if a sequence with the specified value is present in the object 	        x in y
 #not in 	 Returns True if a sequence with the specified value is not present in the object      	x not in y

#Python Bitwise Operators --> to compare (binary) numbers
#Operator 	#Name 	                  #Description
 #&  	     AND 	                   Sets each bit to 1 if both bits are 1
 #| 	     OR 	                   Sets each bit to 1 if one of two bits is 1
 # ^ 	     XOR 	                   Sets each bit to 1 if only one of two bits is 1
 #~  	     NOT 	                   Inverts all the bits
 #<< 	     Zero fill left shift 	   Shift left by pushing zeros in from the right and let the leftmost bits fall off
 #>> 	     Signed right shift 	   Shift right by pushing copies of the leftmost bit in from the left, and let the rightmost bits fall off
