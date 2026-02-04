void main (){
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

    if (bmi >= 25){
        System.out.println("Overweight");
    } else if (bmi >= 18.5) {
        System.out.println("Normal weight");
    } else {
        System.out.println("Underweight");
    }

    //Opgave 3:
    int time = 14;

    if (time >= 5 && time <= 11){
        System.out.println("Good morning");
    } else if (time >= 12 && time <= 17){
        System.out.println("God afternoon");
    } else if (time >= 18 && time <= 21){
        System.out.println("God evening");
    } else {
        System.out.println("God night");
    }

    //Opgave 4:
    int score = 88;
    String grade;
    String status;
    String comment;

    if (score >= 90){
        grade = "A";
        comment = "Excellent";
    } else if (score >= 80 && score < 90){
        grade = "B";
        comment = "Good";
    } else if (score >= 70 && score < 80){
        grade = "C";
        comment = "Satisfactory";
    } else if (score >= 60 && score <70){
        grade = "D";
        comment = "Need improvement";
    } else {
        grade = "F";
        comment = "Failing";
    }

    if (score >= 60){
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

    if (totalPrice1 > 500 || isMember && totalPrice1 > 200){
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
    int agelimit= 15;
    int guestAge = 16;
    boolean hasParentalConsent = true;

    if (guestAge >=15){
        System.out.println("You can watch the movie");
    } else if(hasParentalConsent && guestAge >13 && guestAge <= 14) {
        System.out.println();
    } else {
        System.out.println("you are not old enogh");
    }

    if (guestAge >= agelimit || hasParentalConsent && guestAge >= 13){
        System.out.println("can watch movie");
    } else {
        System.out.println("You are not old enough" );
    }

    //Opgave 7:
    int partySize = 4;
    int availableSeats = 6;
    boolean hasReservation = false;
    int waitTime = 20;
    boolean restaurantFull = false;

    if (partySize <= availableSeats && waitTime <= 20 || hasReservation && !restaurantFull){
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
    int basisPraemie = 5000;
    int tilaeg = 2000;

    if ((age < 25) || (age > 70) || (accidents > 2) || !riskZone) {
        System.out.println(basisPraemie + tilaeg);
    }








}
