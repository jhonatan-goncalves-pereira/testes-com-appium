# 📌 Configuração do Ambiente de Desenvolvimento

Este guia fornece um passo a passo para configurar um ambiente de desenvolvimento para automação de testes em dispositivos Android.

---

## 📥 Requisitos

### 🔹 Instalar Node.js
[Baixar Node.js](https://nodejs.org/en/download)

### 🔹 Instalar o Java (Java 8 ou superior)
[Baixar Java 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)

### 🔹 Instalar Android Studio
[Baixar Android Studio](https://developer.android.com/studio)

### 🔹 Instalar IntelliJ IDEA (Opcional)
[Baixar IntelliJ IDEA](https://www.jetbrains.com/idea/download)

### 🔹 Instalar Xcode (Apenas para macOS)
[Baixar Xcode](https://apps.apple.com/us/app/xcode/id497799835)

### 🔹 Instalar Appium
[Baixar Appium](https://appium.io/)

---

## ⚙️ Configuração do Ambiente

### 🔹 Configurar o ANDROID_HOME
[Guia de Configuração](https://youtu.be/yukIc-a5z5k)

### 🔹 Configurar o JAVA_HOME
[Guia de Configuração](https://youtu.be/gIFgBMZX6e8)

### 🔹 Configurar Emuladores
Abra o Android Studio, acesse **AVD Manager** e configure um emulador de sua preferência.

---

### 🔹 Configurar um Emulador Android

- Abra o **Android Studio**
- Acesse **AVD Manager**
- Crie e configure um emulador com as especificações desejadas
- Certifique-se de que ele esteja rodando corretamente executando:
  ```sh
  adb devices
  ```

Depois disso, reinicie o Appium e o emulador.

---

## 🛠️ Configuração do Appium Inspector

Para iniciar o **Appium Inspector**, utilize a seguinte configuração JSON:

```json
{
  "platformName": "Android",
  "appium:deviceName": "emulator-5554",
  "appium:app": "C:\\Users\\User\\Downloads\\ApiDemos-debug.apk",
  "appium:automationName": "UiAutomator2"
}
```

Caso ocorra o erro **"Could not find a driver for automationName"**, verifique se o driver UiAutomator2 está instalado executando:
```sh
appium driver list --installed
```
Se não estiver, instale com:
```sh
appium driver install uiautomator2
```

Depois disso, reinicie o Appium e o emulador.

---

