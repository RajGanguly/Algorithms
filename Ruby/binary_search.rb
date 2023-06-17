def binary_search(arr, k)
    n = arr.size
    l=0
    h = n-1
    while(l<=k)
        mid = l + (h-l)/2
        if(arr[mid] == k)
            return mid
        elsif(arr[mid] < k)
            l=mid+1
        else
             h=mid-1
        end           
    end
    return -1
end

arr = [2,3,4,5,6,7]
k = 6
x = binary_search(arr, k)
puts x