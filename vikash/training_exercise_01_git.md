 # Description: Git Exercise

### 1. List the Global Configs
* List the git global configs

### 2. Track a New Project With Git
* Create a sample project in a dir
* Track the above project with git
* Identify the location of config for the project

### 3. Stage a Changed File 
* Modify an existing file
* Add a new file to the project
* Stage the file changes

### 4. Revert the Staged Filesco
* Modify an existing file
* Add a new file to the project
* Stage the file changes
* Revert the staged files

### 5. Commit all Unstaged and Staged Files at Once
* Add a new file
* Stage the file change
* Modify an exiting file
* Commit all the changes at once

### 6. Commit Selective Files
* Add 2 new files
* Modify 3 existing files
* Pick 1 each from the above files and commit

### 7. Change the Previous Commit Title
* Change a file and commit
* Now modify the commit title

### 8. Modify the Title for Already Pushed Commit
* Change a file and commit
* Push the changes to remote branch
* Now modify the commit title
* Push the changes again and create a merge request
* List the problems

### 9. Delete a Local Branch

### 10. Delete a Remote Branch

### 11. Undo Last Unpushed Commit
* Create branch from develop
* Modify a file and commit
* Now undo the changes

### 12. Undo Last Pushed Commit
* Create branch from develop
* Modify a file and commit
* Push the branch to remote
* Now undo the changes

### 13. Add Missed Files to the Previous Commit
* Checkout a branch from develop
* Modify 5 files
* Commit only 3 files
* Now add the rest of 2 file changes to the same commit

### 14. Merge Conflict
* Form a team of 2 developers Dev1, Dev2
* Dev1 creates a new branch test-branch-{dev_name} from develop.
* Dev1 modifies a line in existing file, commits and pushes the branch to remote.
* Dev2 creates a new branch test-branch-{dev_name} from develop
* Dev2 modifies the same line in the same file and commit.
* Dev2 now should take the change from dev1 branch and push the dev2 branch to remote.

### 15. Cherry Pick a Commit From Other Branch
* Create a branch test-branch-1 from develop
* Modify a line in a file and commit
* Now modify the same line and commit again
* Checkout to develop branch
* Now create another branch test-branch-2 from develop
* Get the changes of first commit from the test-branch-1 to test-branch-2

### 16. Preserve the Uncommitted Work Done on Main Branch
* Checkout to develop branch and remember the state.
* Change a file and commit
* Change another file
* Work on a new task from the previous state of develop branch while preserving the previous work.

### 17. Fix a Spoiled Local Branch
* Checkout a new branch b1 from develop
* Make a file change and commit
* Checkout to develop and create new branch b2
* Change a file and commit
* Now merge b1 into b2
* Change another file and commit
* Change couple more files
* Do git add for 1 change
* Now Fix the b2 branch not to have b1 changes but rest of the changes.

### 18. Save the Committed, Uncommitted Work in a File and Get it Back.
* Checkout a new branch b1 from develop
* Change a file and commit
* Change another 2 files and run git add 1 of those files
* Now save the state to a file and restore it back in your partner's system.
