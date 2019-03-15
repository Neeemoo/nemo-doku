from tkinter import *

class Calculator:
    def __init__(self, master):
        self.master = master
        master.title("Python Calculator")



root = Tk()
my_gui = Calculator(root)
root.mainloop()
