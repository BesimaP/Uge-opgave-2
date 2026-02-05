void main () {
    //Opgave 1: Shopping discount
    double totalPrice = 1500;
    double finalPrice;

    if (totalPrice > 1000) {
        double discount = totalPrice * 0.2;
        finalPrice = totalPrice - discount;
        System.out.println("Discount applied");
    } else {
        finalPrice = totalPrice;
    }
    System.out.println("Final price: " + finalPrice + " kr.");

    //Opgave 2: BMI calculator
    double weight = 54;
    double height = 165;
    double bmi = weight / (height * height);

    System.out.println("BMI: " + bmi);

    if (bmi >= 25) {
        System.out.println("Overweight");
    } else if (bmi >= 18.5) {
        System.out.println("Normal weight");
    } else {
        System.out.println("Underweight");
    }

    //Opgave 3:
    int time = 14;

    if (time >= 5 && time <= 11) {
        System.out.println("Good morning");
    } else if (time >= 12 && time <= 17) {
        System.out.println("God afternoon");
    } else if (time >= 18 && time <= 21) {
        System.out.println("God evening");
    } else {
        System.out.println("God night");
    }

    //Opgave 4:
    int score = 88;
    String grade;
    String status;
    String comment;

    if (score >= 90) {
        grade = "A";
        comment = "Excellent";
    } else if (score >= 80 && score < 90) {
        grade = "B";
        comment = "Good";
    } else if (score >= 70 && score < 80) {
        grade = "C";
        comment = "Satisfactory";
    } else if (score >= 60 && score < 70) {
        grade = "D";
        comment = "Need improvement";
    } else {
        grade = "F";
        comment = "Failing";
    }

    if (score >= 60) {
        status = "PASS";
    } else {
        status = "FAIL";
    }

    System.out.println("=== STUDENT REPORT ===");
    System.out.println("Score: " + score);
    System.out.println("Grade: " + grade);
    System.out.println("Status: " + status);
    System.out.println("Comment: " + comment);
    System.out.println("=== === === === === ===");

    //Opgave 5:
    double totalPrice1 = 350;
    boolean isMember = true;
    double shippingCost;

    if (totalPrice1 > 500 || isMember && totalPrice1 > 200) {
        shippingCost = 0;
        System.out.println("You will get free shipping!");
    } else {
        shippingCost = 50;
        System.out.println("You need to pay shipping: " + shippingCost);
    }

    double finalTotal = totalPrice1 + shippingCost;
    System.out.println("Sum: " + totalPrice1 + " kr.");
    System.out.println("Shipping: " + shippingCost + " kr.");
    System.out.println("Total: " + finalTotal + " kr.");

    //Opgave 6:
    int agelimit = 15;
    int guestAge = 16;
    boolean hasParentalConsent = true;

    if (guestAge >= 15) {
        System.out.println("You can watch the movie");
    } else if (hasParentalConsent && guestAge > 13 && guestAge <= 14) {
        System.out.println();
    } else {
        System.out.println("you are not old enogh");
    }

    //alternativt:
    if (guestAge >= agelimit || hasParentalConsent && guestAge >= 13) {
        System.out.println("can watch movie");
    } else {
        System.out.println("You are not old enough");
    }

    //Opgave 7:
    int partySize = 4;
    int availableSeats = 6;
    boolean hasReservation = false;
    int waitTime = 20;
    boolean restaurantFull = false;

    if (partySize <= availableSeats && waitTime <= 20 || hasReservation && !restaurantFull) {
        System.out.println("Table available");
        System.out.println("Estimated wait: " + waitTime + " minutes.");
    } else {
        System.out.println("No table available");
    }

    //Opgave 8:
    int age = 22;
    boolean hasAccidents = false;
    int accidents = 0;
    boolean riskZone = false;
    int basisPremium = 5000;
    int premium;

    if ((age < 25) || (age > 70) || (hasAccidents && accidents > 2) || riskZone) {
        premium = basisPremium + 2000;
        System.out.println("Higher risk category");
    } else {
        premium = basisPremium;
        System.out.println("Standard risk category");
    }
    System.out.println("Annual premium: " + premium + " kr.");

    //Opgave 9:
    boolean isAdmin = true;
    boolean accountActive = true;
    boolean isSuperUSer = false;
    boolean suspended = false;
    boolean isUser = false;
    boolean isGuest = false;
    boolean guestTimeValid = false;
    String accessLevel;

    if (isAdmin && accountActive || isSuperUSer) {
        accessLevel = "Full access";
    } else if ((isUser && accountActive && !suspended) || (isGuest && guestTimeValid)) {
        accessLevel = "Limited access";
    } else {
        accessLevel = "Access denied";
    }
    System.out.println("=== ACCESS CONTROL ===");
    System.out.println("Admin: " + isAdmin);
    System.out.println("Active: " + accountActive);
    System.out.println("Result: " + accountActive);
    System.out.println("=======================");

    //Opgave 10:
    String item = "pizza";
    int quantity = 2;
    double price;

    switch (item) {
        case "burger":
            price = 89.0;
            break;
        case "pizza":
            price = 95.0;
            break;
        case "salad":
            price = 65.0;
            break;
        case "pasta":
            price = 79.0;
            break;
        case "steak":
            price = 145.0;
            break;
        default:
            price = 0.0;
            System.out.println("Item not found");
    }
    double total = price * quantity;
    System.out.println("Item: " + item);
    System.out.println("Price: " + price + " kr.");
    System.out.println("Quantity: " + quantity);
    System.out.println("Total price: " + total + " kr.");

    //Opgave 11:
    String zone = "National";
    double weight1 = 7.0;
    double price1;
    double addedCouts = 0.0;

    switch (zone) {
        case "local":
            price1 = 50.0;
            break;
        case "Regional":
            price1 = 100.0;
            break;
        case "National":
            price1 = 150.0;
            break;
        case "International":
            price1 = 300.0;
            break;
        default:
            price1 = 0.0;
            System.out.println("cost not found");
    }

    if (weight1 > 5.0) {
        double addedKg = weight1 - 5.0;
        addedCouts = addedKg * 20.0;
    }

    double finalpricee = price1 + addedCouts;

    System.out.println("Zone: " + zone);
    System.out.println("Weight: " + weight1 + " kg");
    System.out.println("Base cost: " + price1 + " kr.");
    System.out.println("Added couts: " + addedCouts + " kr.");
    System.out.println("Finalprice: " + finalpricee + " kr.");

    //Opgave 12: ATM-transaktion
    double balance = 5000.0;
    double amount = 1000.0;
    String operation = "withdraw";
    boolean success = true;

    switch (operation) {
        case "withdraw":
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + " kr");
            } else {
                System.out.println("Insufficient funds");
                success = false;
            }
            break;
        case "deposit":
            balance += amount;
            System.out.println("Deposited: " + amount + " kr");
            break;
        case "balance":
            System.out.println("Current balance: " + balance + " kr");
            break;
        case "transfer":
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Transferred: " + amount + " kr");
            } else {
                System.out.println("Insufficient funds");
                success = false;
            }
            break;
        default:
            System.out.println("Invalid operation");
            success = false;
    }

    if (success && !operation.equals("balance")) {
        System.out.println("New balance: " + balance + " kr");
    }

    //Opgave 13:
    String eventType = "concert";
    int quantity1 = 2;
    boolean isStudent = true;
    double basePrice;
    double discount = 0.0;

    switch (eventType) {
        case "movie":
            basePrice = 100;
            break;
        case "concert":
            basePrice = 250;
            if (isStudent) {
                discount = 0.20;
            }
            break;
        case "sports":
            basePrice = 200;
            break;
        case "theater":
            basePrice = 150;
            if (isStudent) {
                discount = 0.20;
            }
            break;
        default:
            basePrice = 0;
            System.out.println("Invalid event type");
    }

    double pricePerTicket = basePrice * (1 - discount);
    double total2 = pricePerTicket * quantity1;

    System.out.println("Event: " + eventType);
    System.out.println("Base price: " + basePrice + " kr");

    if (discount > 0) {
        System.out.println("Student discount: " + (discount * 100) + "%");
    }

    System.out.println("Price per ticket: " + pricePerTicket + " kr");
    System.out.println("Quantity: " + quantity);
    System.out.println("Total: " + total + " kr");

    //Opgave 14:
    String item1 = "coffee";
    String size = "large";
    int quantity2 = 2;
    double basePrice1;
    double sizeMultiplier = 1.0;

    // Get base price
    switch (item1) {
        case "coffee":
            basePrice1 = 25.0;
            break;
        case "tea":
            basePrice1 = 20.0;
            break;
        case "sandwich":
            basePrice1 = 45.0;
            break;
        case "cake":
            basePrice1 = 35.0;
            break;
        default:
            basePrice1 = 0.0;
            System.out.println("Invalid item");
    }

    // Get size multiplier (only for drinks)
    if (item.equals("coffee") || item.equals("tea")) {
        switch (size) {
            case "small":
                sizeMultiplier = 1.0;
                break;
            case "medium":
                sizeMultiplier = 1.2;
                break;
            case "large":
                sizeMultiplier = 1.5;
                break;
            default:
                System.out.println("Invalid size");
        }
    }

    double unitPrice = basePrice * sizeMultiplier;
    double total1 = unitPrice * quantity2;

    System.out.println("=== ORDER ===");
    System.out.println("Item: " + item1);
    if (item.equals("coffee") || item1.equals("tea")) {
        System.out.println("Size: " + size);
    }
    System.out.println("Quantity: " + quantity2);
    System.out.println("Unit price: " + unitPrice + " kr");
    System.out.println("Total: " + total1 + " kr");
    System.out.println("=============");

    //Opgave 15:
    double savings = 0.0;
    double monthlyDeposit = 500;
    double goal = 10000.0;
    int months = 0;

    while (savings < goal) {
        savings += monthlyDeposit;
        months++;
    }
    System.out.println("Months: " + months);

    //Opgave 16: (ANDET OUTPUT)
    double monthdeposit = 200.0;
    double repaymentGoal = 5000.0;
    int months1 = 0;

    while (monthdeposit <= repaymentGoal) {
        repaymentGoal -= monthdeposit;
        months1++;
    }
    System.out.println("Months: " + months1);

    //Opgave 17:
    double celsius = 0.0;
    double fahrenheit;

    while (celsius <= 100) {
        fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println("Celsius: " + celsius + " = " + "Fahrenheit: " + fahrenheit);
        celsius += 10;
    }

    //Opgave 18:
    double principal = 10000.0;
    int years = 0;

    while (principal < 20000.0) {
        principal *= 1.05;
        years++;
    }
    System.out.println("Target reached in " + years + " years");

    /*Opgave 19:
    Scanner scan = new Scanner (System.in);
    String password = "secret123";
    int maxAttempt = 3;
    int attempts = 0;
    boolean correct = false;

    while (attempts <= maxAttempt && !correct){
        System.out.println("Indtast password: ");
        String password1 = scan.nextLine();
        attempts++;

        if(password1.equals (password)){
            correct = true;
            System.out.println("Access granted");
        } else {
            System.out.println("Wrong password");
        }
    }
    if(!correct){
        System.out.println("Account locked");
        }
    */

    //Opgave 20;
    double monthsaving = 10000;
    double finall = 0.0;

    for (int month = 1; month <= 12; month++) {
        finall += monthsaving;
        System.out.println("Month: " + month + " = " + finall + "kr.");
    }
    System.out.println("Total after 12 month: " + finall + " kr.");

    //Opgave 21:
    int n = 1;
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }

    //Opgave 22:
    for (int i = 1; i <= 30; i++) {
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println("Fizzbuzz");
        } else if (i % 3 == 0){
            System.out.println("Fizz");
        } else if (i % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    //Opgave 23:
    int primtal = 29;
    boolean isPrime = true;

    for (int i = 2; i < primtal; i++){
        if (primtal % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime){
        System.out.println(primtal + " is prime");
    } else {
        System.out.println(primtal + "is not prime");
    }

    //Opgave 24: Grade statistics


}