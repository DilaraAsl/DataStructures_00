package buildQueues.buildQueueFromLinkedList;

import java.util.Queue;

public class QNode<T>{
    T value;
    QNode<T> next;

    public QNode(T value){
        this.value=value;
    }
}
