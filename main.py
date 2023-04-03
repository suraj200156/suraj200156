
def main():
    print("shop name")
    while True:
        print("menu")
        try:
            rawInput = int(input("Enter any number from 1 to 4: "))
            if (rawInput == 1):
 
                print("display")

            elif (rawInput == 2):
                  print("order")
               
            elif (rawInput == 3):
                print("sell") 
               
            elif (rawInput == 4):
                print("exit")
 
            else:
               print("The number you have entered is not in the menu..... ")
                                  
        except ValueError:
            print("Please input a valid number from the menu......  ")


if __name__ == '__main__':
    main()
