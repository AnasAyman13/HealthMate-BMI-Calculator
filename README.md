# 📱 HealthMate – BMI Calculator App  

A smart and intuitive Android application to calculate **Body Mass Index (BMI)** with ease and accuracy.  
Built using **Kotlin** and **XML** with modern **Material Design UI**.  

---

## 🚀 Features  
- **User Input Support**  
  - Enter weight & height easily.  
  - Supports both **Metric (kg/cm)** and **Imperial (lbs/in)** units.  

- **Unit Conversion Toggle**  
  - SwitchCompat toggle to change between Metric and Imperial.  
  - Dynamic recalculation and hint text updates.  

- **Accurate BMI Calculation**  
  - Formula (Metric): `BMI = weight / (height / 100)^2`  
  - Formula (Imperial): `BMI = (weight / height²) * 703`  
  - Handles decimals & invalid inputs.  

- **BMI Classification**  
  - Automatically categorizes BMI into:  
    - Underweight  
    - Normal weight  
    - Overweight  
    - Obese  

- **Modern & Clean UI**  
  - Material Design components (TextInputLayout, ScrollView, etc.)  
  - Responsive layout for portrait & landscape.  
  - RTL (Right-to-Left) support.  

- **Quick Reset Option**  
  - Snackbar with "Reset" action clears inputs & results.  

- **Cross-Device Compatibility**  
  - Tested on multiple screen sizes & Android versions.  
  - Smooth scrolling on smaller screens.  

---

## 🛠️ Tech Stack  
- **Language:** Kotlin  
- **UI:** XML (Material Design)  
- **IDE:** Android Studio  

---

## 📂 Project Structure  
```
HealthMate-BMI-Calculator/
│── app/
│   ├── src/main/java/com/bmi/calculator/MainActivity.kt
│   ├── src/main/res/layout/activity_main.xml
│   ├── src/main/res/values/strings.xml
│   └── ...
│── build.gradle.kts
│── settings.gradle.kts
│── README.md
```

---

## 📦 Installation  
1. Clone the repository:  
   ```bash
   git clone https://github.com/AnasAyman13/HealthMate-BMI-Calculator.git
   ```
2. Open in **Android Studio**.  
3. Build & run on emulator or physical device.  

---

## 🎯 Why This App?  
Whether you're a **fitness enthusiast** or just tracking your health, HealthMate makes calculating BMI **simple, fast, and user-friendly**.  

---

## 📜 License  
This project is licensed under the **MIT License** – free to use and modify.  
