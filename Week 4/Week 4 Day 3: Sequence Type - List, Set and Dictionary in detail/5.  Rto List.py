if __name__=="__main__":
    num_vehicles = int(input())
    max_per_day = int(input())
    reg_details = []
    for i in range(num_vehicles):
        reg_no = input().strip()
        ch_no = input().strip()
        eng_no = input().strip()
        owner_name = input().strip()
        address = input().strip()
        reg_details.append((reg_no, ch_no, eng_no, owner_name, address))
    print("Reg.no: chassis no: engine no: owner name: address:")
    for reg in reg_details:
        print(*reg)

