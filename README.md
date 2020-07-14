# BankingAPP
how to start grafan and promotheus
docker-compose -f metrics-compose.yml up --build
docker-compose -f metrics-compose.yml down
----------
   53    kubectl config view
   54  kubectl proxy --port=8080
   55  kubectl get nodes
   56  kubectl get pods
   57  kubectl describe service banking-app
   58  kubectl get pods --selector="run=banking-app" --output=wide
   61  kubectl get services
   ---delete ---
   62  kubectl delete -f service.yml
   63  kubectl delete -f kubernates.yml
   ---create ----
   64  kubectl create -f kubernates.yml
   65  kubectl create -f service.yml


