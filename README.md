Aqui está a versão corrigida e aprimorada do seu README, com links diretos para downloads, instruções adicionais sobre o Appium Doctor e melhorias na organização geral. Essa versão segue boas práticas para um guia de configuração profissional e claro.

---

# 📌 Configuração do Ambiente de Desenvolvimento

Este guia fornece um passo a passo detalhado para configurar um ambiente de desenvolvimento robusto para automação de testes em dispositivos Android utilizando **Appium**.

---

## 📥 Requisitos

### 🔹 Instalar Node.js
- [Baixar Node.js](https://nodejs.org/en/download)
- Certifique-se de instalar a versão LTS (Long Term Support) para garantir estabilidade.

### 🔹 Instalar o Java (Java 8 ou superior)
- [Baixar Java 8](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
- Ou, se preferir uma versão mais recente, use o [OpenJDK](https://openjdk.org/).

### 🔹 Instalar Android Studio
- [Baixar Android Studio](https://developer.android.com/studio)
- Durante a instalação, selecione os componentes obrigatórios, como o SDK do Android.

### 🔹 Instalar IntelliJ IDEA (Opcional)
- [Baixar IntelliJ IDEA](https://www.jetbrains.com/idea/download)

### 🔹 Instalar Xcode (Apenas para macOS)
- [Baixar Xcode](https://apps.apple.com/us/app/xcode/id497799835)

### 🔹 Instalar Appium
- Use o gerenciador de pacotes npm para instalar o Appium:
  ```sh
  npm install -g appium
  ```
- Para verificar se a instalação foi bem-sucedida:
  ```sh
  appium --version
  ```

### 🔹 Instalar Appium Doctor
- O Appium Doctor é uma ferramenta essencial para diagnosticar problemas de configuração no ambiente.
  ```sh
  npm install -g appium-doctor
  ```
- Execute o comando abaixo para verificar se todas as dependências estão configuradas corretamente:
  ```sh
  appium-doctor
  ```

---

## ⚙️ Configuração do Ambiente

### 🔹 Configurar o ANDROID_HOME
- Adicione a variável de ambiente `ANDROID_HOME` apontando para o diretório do SDK do Android instalado pelo Android Studio.
- Exemplo:
  ```sh
  export ANDROID_HOME=/Users/<seu_usuario>/Library/Android/sdk
  export PATH=$PATH:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools
  ```
- [Guia de Configuração Detalhada](https://youtu.be/yukIc-a5z5k)

### 🔹 Configurar o JAVA_HOME
- Adicione a variável de ambiente `JAVA_HOME` apontando para o diretório da instalação do Java.
- Exemplo:
  ```sh
  export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home
  export PATH=$JAVA_HOME/bin:$PATH
  ```
- [Guia de Configuração Detalhada](https://youtu.be/gIFgBMZX6e8)

### 🔹 Configurar Emuladores
- Abra o Android Studio, acesse **AVD Manager** e configure um emulador de sua preferência.
- Certifique-se de que o emulador esteja rodando corretamente executando:
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

### 🔹 Verificar Drivers Instalados
- Para verificar se o driver UiAutomator2 está instalado:
  ```sh
  appium driver list --installed
  ```
- Se não estiver instalado, execute:
  ```sh
  appium driver install uiautomator2
  ```

Depois disso, reinicie o Appium e o emulador.

---

## 🛠️ Organização do Diretório

Os testes realizados ao longo do curso seguem uma estrutura dentro de `tests`, ordenados conforme a realização do curso na plataforma [Test Automation University](https://testautomationu.applitools.com/).

### 🔹 Cursos e Links

1. **Mobile Testing with Appium and Java: From Setup to Execution**
  - Diretório: `tests_course_01`
  - Link: [Curso 1](https://testautomationu.applitools.com/appium-java-tutorial-1/)

2. **Mobile Testing with Appium and Java: Advanced Techniques**
  - Diretório: `tests_course_02`
  - Link: [Curso 2](https://testautomationu.applitools.com/appium-java-tutorial-2/)

3. **Automated Visual Testing with Appium**
  - Diretório: `tests_course_03`
  - Link: [Curso 3](https://testautomationu.applitools.com/appium-visual-testing/)

---

## 📚 Recursos Adicionais

- [Documentação oficial do Appium](https://appium.io/docs/en/about-appium/overview/)
- [Guia de Instalação do ADB](https://developer.android.com/studio/command-line/adb)
- [Repositório oficial do Appium no GitHub](https://github.com/appium/appium)

---

Com essas correções e adições, o README agora está mais completo, fácil de seguir e inclui todos os links e ferramentas necessárias para configurar um ambiente de automação robusto com Appium.