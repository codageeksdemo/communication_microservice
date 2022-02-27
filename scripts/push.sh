git add /home/miracle/work/git/communication_microservice
git commit -m"transform generated code"
if [ -n "$(git status - porcelain)" ];
then
 echo "IT IS CLEAN"
else
 git status
 echo "Pushing data to remote server!!!"
 git push -u origin master
fi