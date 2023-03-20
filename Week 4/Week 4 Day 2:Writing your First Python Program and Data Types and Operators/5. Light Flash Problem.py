

if __name__=="__main__":
    N = int(input())
    print("Enter x and y indicates  x/y of an hour")
    x = int(input())
    y = int(input())

    seconds = (x/y) * 3600
    flashes = int(seconds / N)
    flashes=flashes+1

    print("The light will flash", flashes, "times.")
