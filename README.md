## Social Spark App
## Overview
The Social Spark App is a basic Android app created using Android Studio and Kotlin programming. 

The app is designed to help users develop pleasant and meaningful social connections through ideas that are relevant to the time of day they access the app. 

In this busy and often unconnected world, this app is a gentle reminder to connect and interact with others in meaningful ways.
![SOCIAL SPARK MAIN SCREEN](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

## Objectives

-To accept user input based on the time of day.

-Process the input through conditional statements.

-Display appropriate activity suggestions.

-Designing an interactive and visually appealing mobile interface.

## Tech Stack
- **Programming Language:** Kotlin
- **IDE:** Android Studio
- **UI Design:** XML Layouts
- **Platform:** Android SDK

## Features 
- User inputs a field of day e.g)"Morning" in a variable named txtTime.
- "Get Suggestion" button to generate activity ideas.
- "Reset" button to clear input and output.
- Dynamic text to display suggestions.
- Styled user interface with custom background and buttons.

## System design/Logic
The application follows a simple input output model:

1. **Input:**
   -The user enters a time of day e.g("Morning") and their is also text hints to guide the User to input a time of day. Its then stored by a variable named txtTime
2. **Processing:**
   - The app uses IF statements to evaluate the input:
     
 - IF(txtTime=="morning): Suggests morning activities.
![SOCIAL SPARK APP 2](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

- IF(txtTime=="afternoon"): Suggests afternoon activities
![SOCIAL SPARK APP 3](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

 - IF(txtTime=="mid morning"): Suggests mid morning activities
![SOCIAL SPARK APP 4](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

- IF(txtTime=="afternoon snack time": Suggests afternoon snack time activities
![SOCIAL SPARK APP 5](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

 - IF(txtTime=="dinner"):Suggests dinner activities
![SOCIAL SPARK APP 6](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

 - IF(txtTime=="after dinner"):Suggests after dinner activities
![SOCIAL SPARK APP 1](VIRAAT%20NAIDOO%20IMAD%20%ASSIGNMENT%201)

3. **Output:**
   - The result will be dispalyed in a variable named txtResult:
   - "SUGGESTIONS WILL BE DISPLAYED HERE"

 



