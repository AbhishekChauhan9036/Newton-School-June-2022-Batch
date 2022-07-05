/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static void pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=i){
                System.out.print(j+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
/******************************************************************************************************************************************/
/***********End****************/