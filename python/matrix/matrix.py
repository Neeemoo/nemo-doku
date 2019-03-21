from tkinter import *

root = Tk()
root.configure(background='black')
root.attributes('-fullscreen', True)

label = Label(root, text='a', fg='#20C20E')
label.configure(background='black')

label.place(x=1, y=1)

root.mainloop()
