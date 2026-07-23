def call(String url, String branch){
  echo "This is for cloning Code"
  git url: "${url}", branch: "${branch}"
  echo "Cloning Successfully"
}
