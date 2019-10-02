def get_initials(fullname):
    """ Given a person's name, returns the person's initials (uppercase) """
    xs = (fullname)
    name_list = xs.split()
    initials = ""

    for name in name_list:  # go through each name
        initials += name[0].upper()  # append the initial

    return initials
  
def main():
    user_input = input("Please enter your full name:")
    
    print("The intials of", user_input, "are:", get_initials(user_input))

if __name__ == '__main__':
    main()