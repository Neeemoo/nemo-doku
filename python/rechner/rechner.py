print("Bitte geben Sie die erste Zahl ein:")
z1 = int(input())

print("Bitte geben Sie den Operator ein (+, -, *, /)")
o = input()

while o != '+' and o != '-' and o != '*' and o != '/':
    print("Bitte geben Sie + - * oder / ein:")
    o = input()

print("Bitte geben Sie die zweite Zahl ein:")
z2 = int(input())

if o == "+":
    print(z1 + z2)

elif o == "-":
    print(z1 - z2)

elif o == "*":
    print(z1 * z2)

elif o == "/":
    print(z1 / z2)
