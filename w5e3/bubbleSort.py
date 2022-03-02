# Learning to do bubble sorts in Python

my_list = [1, 3, 2, 5, 4, 3, 1, 4, 2, 3, 1]

for i in range(len(my_list)):
    for j in range(len(my_list) - 1):
        if my_list[j] > my_list[j + 1]:
            my_list[j], my_list[j + 1] = my_list[j + 1], my_list[j]

print(my_list)
