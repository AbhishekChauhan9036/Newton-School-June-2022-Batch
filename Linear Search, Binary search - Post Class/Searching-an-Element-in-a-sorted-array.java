/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
static int isPresent(long arr[], int n, long k)
{
		int low=0;int high=n-1;

		while(low<=high){
			int mid=low+(high-low)/2;

			if(arr[mid]==k){
				return 1;
			}else if(arr[mid]<k){
				low=mid+1;
			}

			else{
				high=mid-1;
			}

			mid=(low+(high-low)/2);
		}
		return -1;
}
/******************************************************************************************************************************************/
/***********End****************/