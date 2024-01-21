class One:
    def __init__(self) -> None:
        # protected
        self._a = "one a"
        # private
        self.__b = "one B"

    # getter
    def getPrivateVal(self):
        print("Protected values are:", self._a, self.__b)

    # setter
    def setNewPrivateVal(self, newA, newB):
        self._a = newA
        self.__b = newB
        self.getPrivateVal()


class Two(One):
    def __init__(self) -> None:
        super().__init__()

    # can access(not good practice)
    def accessProtected(self):
        print("protected", self._a)

    # cannot access
    def accessPrivate(self):
        print("private", self.__b)


testOne = One()
# can access
print("outside protected:", testOne._a)
# can't access
print("outside private:", testOne.__b)

testTwo = Two()
testTwo.accessProtected()
testTwo.accessPrivate()

testTwo.getPrivateVal()
testTwo.setNewPrivateVal("A Fahim", "B Suhan")
