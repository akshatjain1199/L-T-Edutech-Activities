

if __name__=="__main__":
    values=(input())
    mytup=tuple(map(int , values.split()))
    valuetup=[]
    zerotup=[]
    for item in mytup:
        if item!=0:
            valuetup.append(item)
        else:
            zerotup.append(item)
    finaltup=tuple(valuetup+zerotup)
    print(f"Initial Value: {mytup} \n Final value: {finaltup}")
