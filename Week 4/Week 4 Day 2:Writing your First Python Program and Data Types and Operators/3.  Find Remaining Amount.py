

if __name__=="__main__":
    amount=int(input("\nEnter the total amount"))
    days= int(input("\nEnter the number of days"))
    cost=int(input("\nEnter the cost of 1 litre of milk"))
    totalcost=0
    print(f"\nAmount of milk Shruthi will buy for {days} days is:")
    for i in range(days):
        n=int(input())
        totalcost+= cost * n
    remaing=amount-totalcost
    print("Remaining amount with Shruthi is: ",remaing)
