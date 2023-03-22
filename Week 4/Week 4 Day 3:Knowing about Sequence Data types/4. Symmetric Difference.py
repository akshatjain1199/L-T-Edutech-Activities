if __name__ == "__main__":
    #Fill your code here.
    set1 = set(map(int, input().split(",")))
    set2 = set(map(int, input().split(",")))

    if set1 == set2:
        print("invalid set")
    else:
        print("{" + ",".join(str(num) for num in sorted(set1.symmetric_difference(set2))) + "}")
