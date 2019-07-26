## Customizations for Aniruddha

####To create a directory and move inside it
```d () {
mkdir $1
cd $1
}
```
#### To check the execution of some tutorial scripts by taking clipboard content automatically
```chkscript () {
xclip -selection clipboard -o | cat > ~/build/practice/$1
chmod 764 $1
./$1
}
```
#### Git customizations
```aidl
alias yst="git status"
```

#### Command used after commiting to push to branch
```ygpush () {
git checkout $1
git pull origin
git checkout $2
git merge $1
git push origin $2
}
```

#### Aliases common
```
alias ..="cd .."
alias ...="cd ../.."
alias ....="cd ../../.."
alias pt="cd ~/personal/code/perfios-training"
```
