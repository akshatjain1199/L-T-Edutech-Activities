

if __name__=="__main__":
    count=0
    word = input("Enter the word :\n")
    word=word.lower()
    for words in word:
        if(words=='a' or words=='e' or words=='i' or words=='o' or words=='u'):
            count=count+1
    print(f"Count of vowels in {word} is {count}")
