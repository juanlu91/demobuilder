#!/bin/bash
USER="SMA"
PASS="SMA"
WORKSPACE_NAME="Workspace"
curl -k -basic -u $USER:$PASS https://antgamdiapc.lsi.us.es:9191/IDEAS/file/createWorkspace?workspaceName=$WORKSPACE_NAME
PROJECT_NAME="Amazon"
curl -k -basic -u $USER:$PASS https://antgamdiapc.lsi.us.es:9191/IDEAS/file/createProject?projectUri=$WORKSPACE_NAME/$PROJECT_NAME
			
				
FILE_NAME="basicPlan.at"
FILE_URI="$WORKSPACE_NAME/$PROJECT_NAME/$FILE_NAME"
curl -k -basic -u $USER:$PASS -H "Accept: application/json" -H "Content-Type:application/json" https://antgamdiapc.lsi.us.es:9191/IDEAS/file/createFile?fileUri=$FILE_URI
curl -k -u $USER:$PASS -X POST -d "fileUri=$FILE_URI" -d "fileContent=$(cat $FILE_NAME)" https://antgamdiapc.lsi.us.es:9191/IDEAS/file/setFileContent

FILE_NAME="basicPlan.opl"
FILE_URI="$WORKSPACE_NAME/$PROJECT_NAME/$FILE_NAME"
curl -k -basic -u $USER:$PASS -H "Accept: application/json" -H "Content-Type:application/json" https://antgamdiapc.lsi.us.es:9191/IDEAS/file/createFile?fileUri=$FILE_URI
curl -k -u $USER:$PASS -X POST -d "fileUri=$FILE_URI" -d "fileContent=$(cat $FILE_NAME)" https://antgamdiapc.lsi.us.es:9191/IDEAS/file/setFileContent
				
