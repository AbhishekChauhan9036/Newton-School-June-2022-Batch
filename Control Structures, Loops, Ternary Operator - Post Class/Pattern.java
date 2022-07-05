/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static void Pattern(int N){
  System.out.println("*");

  for(int i=1;i<=N-2;i++){
    System.out.print("*");
    for(int j=1;j<=i;j++){
      System.out.print("^");
    }

    System.out.println("*");

  }

  for(int i=1;i<=N+1;i++){
    System.out.print("*");
  }
}
/******************************************************************************************************************************************/
/***********End****************/