from tkinter import *

root = Tk()
root.configure(background='black')
w = 300
h = 200
x = 50
y = 100
root.geometry("%dx%d+%d+%d" % (w, h, x, y))

label = Label(root, text='a', fg='#20C20E')
label.configure(background='black')
label.place(x=1, y=1)
label.pack()

root.mainloop()
