

if __name__=="__main__":
    print("Enter the value of a")
    a=int(input())
    print("Enter the value of b")
    b=int(input())
    print("Enter the value of n")
    n=int(input())
    def Power(a, b, n):
        if (n<0 or b<0):
            print("Invalid Input")
        else:
            for i in range(n):
                result = (a+i)**b
                
                print(f"{a+i}**{b}={result}")
    Power(a,b,n)
