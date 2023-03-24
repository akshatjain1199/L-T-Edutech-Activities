
if __name__=="__main__":
    n = int(input("Enter the no donors available\n"))

    donors = []
    for i in range(1, n+1):
        print(f"Enter the details of donor {i}")
        name = input()
        email = input()
        phone = input()
        blood_group = input()
        donors.append({'name': name, 'email': email, 'phone': phone, 'blood_group': blood_group})

    required_blood_group = input("Enter the required blood group\n")

    matched = False
    for donor in donors:
        if donor['blood_group'] == required_blood_group:
            print("Details of matched donor")
            print(donor['name'])
            print(donor['email'])
            print(donor['phone'])
            print(donor['blood_group'])
            matched = True

    if not matched:
        print("No donor with required blood group")
