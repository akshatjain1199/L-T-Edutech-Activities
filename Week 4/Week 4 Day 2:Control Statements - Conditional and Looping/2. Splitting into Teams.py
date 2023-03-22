

if __name__=="__main__":
    students=int(input("Number of students:\n"))
    teams=int(input("Number of teams:\n"))
    eachteam=int((students)/(teams))
    left=students%teams
    print("The number of students in each team, left out is (",eachteam,",",left,")")
