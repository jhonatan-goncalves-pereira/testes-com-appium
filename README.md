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

### 1. Configurar `ANDROID_HOME`
- **Problema**: A variável de ambiente `ANDROID_HOME` não está definida.
- **Solução**:
  - Localize o diretório onde o SDK do Android está instalado. Normalmente, ele fica em:
    - **Windows**: `C:\Users\<seu_usuario>\AppData\Local\Android\Sdk`
    - **macOS/Linux**: `/Users/<seu_usuario>/Library/Android/sdk`
  - Configure a variável de ambiente:
    - **Windows**:
      1. Abra o menu **Iniciar**, pesquise por "Variáveis de Ambiente" e selecione **Editar as variáveis de ambiente do sistema**.
      2. Clique em **Variáveis de Ambiente**.
      3. Em **Variáveis do Sistema**, clique em **Nova** e adicione:
         ```
         Nome da variável: ANDROID_HOME
         Valor da variável: C:\Users\<seu_usuario>\AppData\Local\Android\Sdk
         ```
      4. Adicione os seguintes caminhos ao `Path`:
         ```
         %ANDROID_HOME%\platform-tools
         %ANDROID_HOME%\tools
         %ANDROID_HOME%\tools\bin
         ```
    - **macOS/Linux**:
      Adicione ao seu arquivo `~/.bashrc`, `~/.zshrc` ou equivalente:
      ```sh
      export ANDROID_HOME=/Users/<seu_usuario>/Library/Android/sdk
      export PATH=$PATH:$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools:$ANDROID_HOME/tools/bin
      ```
      Depois, execute:
      ```sh
      source ~/.bashrc
      ```
  - Verifique se está configurado corretamente:
    ```sh
    echo $ANDROID_HOME
    adb devices
    ```

---

### 2. Configurar `JAVA_HOME`
- **Problema**: A variável de ambiente `JAVA_HOME` não está definida.
- **Solução**:
  - Localize o diretório onde o JDK está instalado. Por exemplo:
    - **Windows**: `C:\Program Files\Java\jdk-<versão>`
    - **macOS/Linux**: `/Library/Java/JavaVirtualMachines/jdk-<versão>/Contents/Home`
  - Configure a variável de ambiente:
    - **Windows**:
      1. Siga os mesmos passos para editar as **Variáveis de Ambiente**.
      2. Em **Variáveis do Sistema**, clique em **Nova** e adicione:
         ```
         Nome da variável: JAVA_HOME
         Valor da variável: C:\Program Files\Java\jdk-<versão>
         ```
      3. Adicione `%JAVA_HOME%\bin` ao `Path`.
    - **macOS/Linux**:
      Adicione ao seu arquivo `~/.bashrc`, `~/.zshrc` ou equivalente:
      ```sh
      export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-<versão>/Contents/Home
      export PATH=$JAVA_HOME/bin:$PATH
      ```
      Depois, execute:
      ```sh
      source ~/.bashrc
      ```
  - Verifique se está configurado corretamente:
    ```sh
    echo $JAVA_HOME
    java -version
    ```

---

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
