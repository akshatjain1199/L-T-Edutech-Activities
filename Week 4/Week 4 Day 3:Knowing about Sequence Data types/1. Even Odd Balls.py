

if __name__=="__main__":
    lst=list(map(int, input("Enter the numbers\n").split()))
    evenlist=[]
    oddlist=[]
    for items in lst:
        if items%2==0:
            evenlist.append(items)
        else:
            oddlist.append(items)
        
    
    print("Even numbers from the list:\n",evenlist)
    print("Odd numbers from the list:\n",oddlist)
