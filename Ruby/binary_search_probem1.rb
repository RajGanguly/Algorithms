# Given a sorted array, find the greatest element ie <=k

# Input arr: [-5, 1,2,4,8,9,10,12,15]

# k = 10, output =10
# k = 2, output =1
# k = 7, output =8

def binary_search_problem(arr, k)
    l=0
    n = arr.size
    h = n-1
    max = arr[0]
    while(l<=h)
        mid = l + (h-l)/2
        if(arr[mid] == k)
            max = k
            break
        elsif arr[mid] < k
            max = arr[mid]
            l = mid+1

        else    
            h = mid - 1
        end    
    end
    return max
end

arr = [-5, 1,2,4,8,9,10,12,15]
k = 5
ans = binary_search_problem(arr, k)
puts ans
