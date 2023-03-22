

if __name__=="__main__":
    N1=int(input())
    N2=int(input())
    N3=int(input())
    N4=int(input())
    N=int(input())
    if N>=N1+N2+N3+N4:
        print("EXT")
    elif(N< N1):
        print("B1")
    elif(N< N1+N2 ):
        print("B2")
    elif(N <N1+N2+N3):
        print("B3")
    else:
        print("B4")
