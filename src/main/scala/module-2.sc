def f1 = (x:Float) => x * 9.0f;

def f2 = (x:Float) => x / 5.0f;

def f3 = (x:Float) => x + 32.0f;

def f4 = f2 compose f1

def f5 = f3 compose f4

val tempList = List( 27.0f, 32.0f, 45.0f, 22.0f, -23f, 2f)

tempList.map(f1)
tempList.map(f4)
tempList.map(f5)



