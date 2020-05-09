package com.mymaps.tugasbesar;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class statistik extends AppCompatActivity {
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grafik);
        BarChart mBarChart = findViewById(R.id.chart);

        float groupSpace = 0.08f;
        float barSpace = 0.02f;
        float barWidth = 0.45f;
        float tahunAwal = 2016f;

        // Data-data yang akan ditampilkan di Chart
        List<BarEntry> dataPemasukan = new ArrayList<BarEntry>();
        dataPemasukan.add(new BarEntry(2016, 1500000));
        dataPemasukan.add(new BarEntry(2017, 1430000));
        dataPemasukan.add(new BarEntry(2018, 1750000));
        dataPemasukan.add(new BarEntry(2019, 1390000));

        List<BarEntry> dataPengeluaran = new ArrayList<BarEntry>();
        dataPengeluaran.add(new BarEntry(2016, 500000));
        dataPengeluaran.add(new BarEntry(2017, 430000));
        dataPengeluaran.add(new BarEntry(2018, 750000));
        dataPengeluaran.add(new BarEntry(2019, 390000));

        // Pengaturan atribut bar, seperti warna dan lain-lain
        BarDataSet dataSet1 = new BarDataSet(dataPemasukan, "Pemasukan");
        dataSet1.setColor(ColorTemplate.JOYFUL_COLORS[0]);

        BarDataSet dataSet2 = new BarDataSet(dataPengeluaran, "Pengeluaran");
        dataSet2.setColor(ColorTemplate.JOYFUL_COLORS[1]);

        // Membuat Bar data yang akan di set ke Chart
        BarData barData = new BarData(dataSet1, dataSet2);

        // Pengaturan sumbu X
        XAxis xAxis = mBarChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM.BOTTOM);
        xAxis.setCenterAxisLabels(true);

        // Agar ketika di zoom tidak menjadi pecahan
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return String.valueOf((int)value);
            }
        });
mBarChart.getAxisRight().setEnabled(false);
mBarChart.getDescription().setEnabled(false);
        mBarChart.setData(barData);
        mBarChart.getBarData().setBarWidth(barWidth);
        mBarChart.getXAxis().setAxisMinimum(tahunAwal);
        mBarChart.getXAxis().setAxisMaximum(tahunAwal + mBarChart.getBarData().getGroupWidth(groupSpace, barSpace) * 4);
        mBarChart.groupBars(tahunAwal, groupSpace, barSpace);
        mBarChart.setDragEnabled(true);
        mBarChart.invalidate();
    }
}
