

if __name__=="__main__":
    address=input().split(",")
    lables=['Door-no', 'Street', 'Area', 'City', 'State', 'Zipcode', 'Country']
    for i in range(len(lables)):
        print(f"{lables[i]}: {address[i]}")
