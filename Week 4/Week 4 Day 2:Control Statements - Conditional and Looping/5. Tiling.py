import math
if __name__=="__main__":
    width = int(input())
    length= int(input())
    for i in range(width):
        t1 = i*8
        if t1 <= width:
            f1 = t1
        else:
            break
    for i in range(length):
        t2 = i*8
        if t2 <= length:
            f2 = t2
        else:
            break
    f = 1
    if width%8==0:
        length = 0
        f = 0
    if length%8==0:
        width= 0
        f = 0
    peice = math.ceil(width/8) + math.ceil(length/8) - f
    full = int(f1*f2/64)
    print(full)
    print(peice)
