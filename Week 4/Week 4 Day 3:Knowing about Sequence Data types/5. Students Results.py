if __name__=="__main__":
    n= int(input())
    passed= {}
    fail={}
    for i in range(n):
        marks= int(input())
        if marks>=40:
            passed[i+1]=marks
        else:
            fail[i+1]=marks
    if len(passed)==0:
        print("All are failed")
    elif len(fail)==0:
        print("All are passed")
    else:
        print("Students who failed in Final Exam")
        for rollno , mark in fail.items():
            print(f"Roll No: {rollno} - Mark: {mark}")
        print("Students who passed in Final Exam")
        for rollno , mark in passed.items():
            print(f"Roll No: {rollno} - Mark: {mark}")        
    
