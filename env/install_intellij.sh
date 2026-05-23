# 1. Remove the file blocking Snap
sudo rm /etc/apt/preferences.d/nosnap.pref

# 2. Update your package manager lists
sudo apt update

# 3. Install snapd
sudo apt install snapd

# 4. Install IntelliJ Community Edition
sudo snap install intellij-idea-community --classic
