def calRemainingMoney(total_money, num_days, cost_per_liter, milkQuantityList):
    total_cost = sum(milkQuantityList) * cost_per_liter
    remaining_money = total_money - total_cost
    return remaining_money

if __name__ == '__main__':
    total_money = int(input("Enter the total amount\n"))
    num_days = int(input("Enter the number of days\n"))
    cost_per_liter = int(input("Enter the cost of 1 litre of milk\n"))
    print("Amount of milk Shruthi will buy for {} days is:".format(num_days))
    milkQuantityList = []
    for i in range(num_days):
        milkQuantity = int(input())
        milkQuantityList.append(milkQuantity)

    remaining_money = calRemainingMoney(total_money, num_days, cost_per_liter, milkQuantityList)
    print("Remaining amount with Shruthi is:{}".format(remaining_money))
