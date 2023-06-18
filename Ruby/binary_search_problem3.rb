# Given an array n of distinct elements, find any peak element
#ie peak element is greater than its adjacent elements

def find_peak_element(arr)
    n = arr.size
    if(arr[0] > arr[1])
        return arr[0]
    end
    if(arr[n-1] > arr[n-2])
        return arr[n-1]
    end
    l = 1
    h = n-2
    while(l<=h)
        mid = l + (h-l)/2
        if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1])
            return arr[mid]
        elsif arr[mid+1] > arr[mid]
            l=mid-1
        else
            l=mid+1
        end            
    end
end    

arr = [4, 7, 8, 17, 6, 2, 8, 16, 17]
n = find_peak_element(arr)

puts n