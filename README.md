# interview-preparation
interview-preparation
## 面试准备

### 1.十大排序算法
首先看哈各排序功能的算法
| 排序算法 | 时间复杂度（平均） | 时间复杂度（最坏） | 时间复杂度（最好） | 空间复杂度 | 稳定性 |
| ------ | ------ | ------ |------ |------ |------ |
| 冒泡排序 | O(n2) | O(n2) | O(n) | O(1) | 稳定 |
| 快速排序 | O(nlgn) | O(n2) | O(nlog2n) | O(1) | 不稳定 |
| 选择排序 | O(n2) | O(n2) | O(n) | O(1) | 不稳定 |
![各算法比较](https://github.com/whd-mtt/interview-preparation/blob/master/img/sort.png)

#### 1.1 冒泡排序
[冒泡排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/BubbleSort.java)
> 算法思想：从数组中第一个数开始，依次遍历数组中的每一个数，通过相邻比较交换，每一轮循环下来找出剩余未排序数的中的最大数并”冒泡”至数列的顶端

算法步骤： 
(1)从数组中第一个数开始，依次与下一个数比较并次交换比自己小的数，直到最后一个数。如果发生交换，则继续下面的步骤，如果未发生交换，则数组有序，排序结束，此时时间复杂度为O(n)； 
(2)每一轮”冒泡”结束后，最大的数将出现在乱序数列的最后一位。重复步骤（1）。

稳定性：稳定排序。

时间复杂度： O(n)至O(n2)，平均时间复杂度为O(n2)。
最好的情况：如果待排序数据序列为正序，则一趟冒泡就可完成排序，排序码的比较次数为n-1次，且没有移动，时间复杂度为O(n)。
最坏的情况：如果待排序数据序列为逆序，则冒泡排序需要n-1次趟起泡，每趟进行n-i次排序码的比较和移动，即比较和移动次数均达到最大值： 
比较次数:Cmax=∑i=1n−1(n−i)=n(n−1)/2=O(n2) 
移动次数等于比较次数，因此最坏时间复杂度为O(n2)。

#### 1.2 快速排序
[快速排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/QuickSort.java)
快速排序（QuickSort）是对冒泡排序的一种改进
> 算法思想： 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。

算法步骤：
(1)设置两个变量i、j，排序开始的时候：i=0，j=N-1；
(2)以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
(3)从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]互换；
(4)从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]互换；
(5)重复第3、4步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）。

稳定性：不稳定排序。

时间复杂度： O（nlog2n）至O(n2)，平均时间复杂度为O（nlgn）。
最好的情况：是每趟排序结束后，每次划分使两个子文件的长度大致相等，时间复杂度为O（nlog2n）。
最坏的情况：是待排序记录已经排好序，第一趟经过n-1次比较后第一个记录保持位置不变，并得到一个n-1个元素的子记录；第二趟经过n-2次比较，将第二个记录定位在原来的位置上，并得到一个包括n-2个记录的子文件，依次类推，这样总的比较次数是： 
比较次数：Cmax=∑i=1n−1(n−i)=n(n−1)/2=O(n2)

#### 1.3 选择排序
[选择排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/SelectSort.java)
选择排序（Selection sort）是一种简单直观的排序算法
> 算法思想： 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。 选择排序是不稳定的排序方法

算法步骤：
(1)对比数组中前一个元素跟后一个元素的大小，如果后面的元素比前面的元素小则用一个变量k来记住他的位置；
(2)接着第二次比较，前面“后一个元素”现变成了“前一个元素”，继续跟他的“后一个元素”进行比较如果后面的元素比他要小则用变量k记住它在数组中的位置(下标)，等到循环结束的时候，我们应该找到了最小的那个数的下标了，
(3)然后对下标进行判断，如果这个元素的下标不是第一个元素的下标，就让第一个元素跟他交换一下值，这样就找到整个数组中最小的数了。然后找到数组中第二小的数，让他跟数组中第二个元素交换一下值，以此类推。

稳定性：不稳定排序

时间复杂度：最坏、最好和平均复杂度均为O(n2)
比较次数：Cmax=∑i=1n−1(n−i)=n(n−1)/2=O(n2)


#### 1.4 堆排序
[堆排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/HeapSort.java)
堆排序（HeapSort）是将数据看成是完全二叉树、根据完全二叉树的特性来进行排序的一种算法
> 算法思想：最大堆要求节点的元素都要不小于其孩子，最小堆要求节点元素都不大于其左右孩子,那么处于最大堆的根节点的元素一定是这个堆中的最大值

算法步骤：
(1)将初始待排序关键字序列(R1,R2….Rn)构建成大顶堆，此堆为初始的无序区；
(2)将堆顶元素R[1]与最后一个元素R[n]交换，此时得到新的无序区(R1,R2,……Rn-1)和新的有序区(Rn),且满足R[1,2…n-1]<=R[n]；
(3)由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区(R1,R2,……Rn-1)调整为新堆，然后再次将R[1]与无序区最后一个元素交换，得到新的无序区(R1,R2….Rn-2)和新的有序区(Rn-1,Rn)。不断重复此过程直到有序区的元素个数为n-1，则整个排序过程完成。

稳定性：不稳定

时间复杂度：O(nlogn)
最坏的情况：如果待排序数组是有序的，仍然需要O(nlogn)复杂度的比较操作，只是少了移动的操作；
最好的情况：如果待排序数组是逆序的，不仅需要O(nlogn)复杂度的比较操作，而且需要O(nlogn)复杂度的交换操作。总的时间复杂度还是O(nlogn)。

#### 1.5 归并排序
[归并排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/MergeSort.java)
归并排序（Merge Sort）是建立在归并操作上的一种有效的排序算法
> 算法思想：算法是采用分治法（Divide and Conquer）的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为二路归并。

算法步骤：
(1)将序列每相邻两个数字进行归并操作（merge)，形成floor(n/2+n%2)个序列，排序后每个序列包含两个元素
(2)将上述序列再次归并，形成floor(n/4)个序列，每个序列包含四个元素
(3)重复步骤2，直到所有元素排序完毕

稳定性：稳定

时间复杂度：O(nlogn) 
最坏的情况：O(nlogn) 
最坏的情况：O(nlogn) 

#### 1.6 计数排序
[计数排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/CountSort.java)
计数排序（Count Sort）非基于比较的排序算法
> 算法思想：对于给定的输入序列中的每一个元素x，确定该序列中值小于x的元素的个数（此处并非比较各元素的大小，而是通过对元素值的计数和计数值的累加来确定）。一旦有了这个信息，就可以将x直接存放到最终的输出序列的正确位置上。

算法步骤：
假设输入的线性表L的长度为n，L=L1,L2,..,Ln；线性表的元素属于有限偏序集S，|S|=k且k=O(n)，S={S1,S2,..Sk}；则计数排序可以描述如下：
(1)扫描整个集合S，对每一个Si∈S，找到在线性表L中小于等于Si的元素的个数T(Si)；
(2)扫描整个线性表L，对L中的每一个元素Li，将Li放在输出线性表的第T(Li)个位置上，并将T(Li)减1。

稳定性： 稳定

时间复杂度：最坏、最好和平均复杂度均为O(n+k)


#### 1.7 桶排序
[计数排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/BucketSort.java)
桶排序 (Bucket sort)或所谓的箱排序，是一个排序算法
> 算法思想：将数组分到有限数量的桶子里。每个桶子再个别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排序）

算法步骤：
(1)将数组所有的元素作为索引，存放到新的数组中
(2)然后按照顺序取不为零的元素，存放在原数组中

稳定性：稳定

时间复杂度：O(n+k)
最坏的情况：O(n2)
最好的情况：O(n)

#### 1.8 基数排序
[基数排序代码](https://github.com/whd-mtt/interview-preparation/blob/master/src/main/java/com/whd/interview/preparation/algorithm/sort/RadixSort.java)
基数排序 (Radix Sort)可以采用LSD（Least significant digital）或MSD（Most significant digital），LSD的排序方式由键值的最右边开始，而MSD则相反，由键值的最左边开始。
> 算法思想：将所有待比较数值（正整数）统一为同样的数位长度，数位较短的数前面补零。然后，从最低位开始，依次进行一次排序。这样从最低位排序一直到最高位排序完成以后, 数列就变成一个有序序列。

稳定性：稳定

时间复杂度：最坏、最好和平均复杂度均为O(n * k)
